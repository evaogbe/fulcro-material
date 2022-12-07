(ns ogbe.fulcro.mui.icons.layers
  #?(:cljs (:require
            ["@mui/icons-material/Layers" :default Layers]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-layers
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Layers)))