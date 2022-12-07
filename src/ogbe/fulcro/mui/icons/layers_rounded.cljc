(ns ogbe.fulcro.mui.icons.layers-rounded
  #?(:cljs (:require
            ["@mui/icons-material/LayersRounded" :default LayersRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-layers-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LayersRounded)))