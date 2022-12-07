(ns ogbe.fulcro.mui.icons.disabled-by-default-outlined
  #?(:cljs (:require
            ["@mui/icons-material/DisabledByDefaultOutlined" :default DisabledByDefaultOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-disabled-by-default-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DisabledByDefaultOutlined)))