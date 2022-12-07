(ns ogbe.fulcro.mui.icons.mail-outline
  #?(:cljs (:require
            ["@mui/icons-material/MailOutline" :default MailOutline]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-mail-outline
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MailOutline)))