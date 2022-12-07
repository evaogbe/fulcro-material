(ns ogbe.fulcro.mui.icons.mail-outlined
  #?(:cljs (:require
            ["@mui/icons-material/MailOutlined" :default MailOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-mail-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MailOutlined)))