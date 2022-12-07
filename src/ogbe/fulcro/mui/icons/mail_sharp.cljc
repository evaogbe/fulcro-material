(ns ogbe.fulcro.mui.icons.mail-sharp
  #?(:cljs (:require
            ["@mui/icons-material/MailSharp" :default MailSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-mail-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MailSharp)))