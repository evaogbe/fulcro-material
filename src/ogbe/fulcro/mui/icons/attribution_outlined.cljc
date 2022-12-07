(ns ogbe.fulcro.mui.icons.attribution-outlined
  #?(:cljs (:require
            ["@mui/icons-material/AttributionOutlined" :default AttributionOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-attribution-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AttributionOutlined)))