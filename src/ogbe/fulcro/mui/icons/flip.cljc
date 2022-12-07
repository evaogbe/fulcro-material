(ns ogbe.fulcro.mui.icons.flip
  #?(:cljs (:require
            ["@mui/icons-material/Flip" :default Flip]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-flip
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Flip)))