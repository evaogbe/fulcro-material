(ns ogbe.fulcro.mui.icons.layers-sharp
  #?(:cljs (:require
            ["@mui/icons-material/LayersSharp" :default LayersSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-layers-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LayersSharp)))