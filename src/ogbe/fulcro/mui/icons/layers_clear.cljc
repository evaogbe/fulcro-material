(ns ogbe.fulcro.mui.icons.layers-clear
  #?(:cljs (:require
            ["@mui/icons-material/LayersClear" :default LayersClear]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-layers-clear
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LayersClear)))