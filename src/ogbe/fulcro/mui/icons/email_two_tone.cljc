(ns ogbe.fulcro.mui.icons.email-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/EmailTwoTone" :default EmailTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-email-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EmailTwoTone)))