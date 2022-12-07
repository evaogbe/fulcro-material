(ns ogbe.fulcro.mui.icons.accessible-outlined
  #?(:cljs (:require
            ["@mui/icons-material/AccessibleOutlined" :default AccessibleOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-accessible-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AccessibleOutlined)))