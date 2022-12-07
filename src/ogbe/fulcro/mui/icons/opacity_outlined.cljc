(ns ogbe.fulcro.mui.icons.opacity-outlined
  #?(:cljs (:require
            ["@mui/icons-material/OpacityOutlined" :default OpacityOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-opacity-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory OpacityOutlined)))