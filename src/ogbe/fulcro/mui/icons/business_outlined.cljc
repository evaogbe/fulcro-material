(ns ogbe.fulcro.mui.icons.business-outlined
  #?(:cljs (:require
            ["@mui/icons-material/BusinessOutlined" :default BusinessOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-business-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BusinessOutlined)))