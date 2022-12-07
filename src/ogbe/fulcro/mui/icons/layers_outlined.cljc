(ns ogbe.fulcro.mui.icons.layers-outlined
  #?(:cljs (:require
            ["@mui/icons-material/LayersOutlined" :default LayersOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-layers-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LayersOutlined)))