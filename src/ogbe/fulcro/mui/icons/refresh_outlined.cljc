(ns ogbe.fulcro.mui.icons.refresh-outlined
  #?(:cljs (:require
            ["@mui/icons-material/RefreshOutlined" :default RefreshOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-refresh-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RefreshOutlined)))