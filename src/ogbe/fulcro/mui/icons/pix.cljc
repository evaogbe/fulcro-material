(ns ogbe.fulcro.mui.icons.pix
  #?(:cljs (:require
            ["@mui/icons-material/Pix" :default Pix]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pix
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Pix)))