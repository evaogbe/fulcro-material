(ns ogbe.fulcro.mui.icons.email-outlined
  #?(:cljs (:require
            ["@mui/icons-material/EmailOutlined" :default EmailOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-email-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EmailOutlined)))