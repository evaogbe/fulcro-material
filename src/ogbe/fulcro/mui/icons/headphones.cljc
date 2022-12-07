(ns ogbe.fulcro.mui.icons.headphones
  #?(:cljs (:require
            ["@mui/icons-material/Headphones" :default Headphones]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-headphones
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Headphones)))