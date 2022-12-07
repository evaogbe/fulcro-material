(ns ogbe.fulcro.mui.icons.email-sharp
  #?(:cljs (:require
            ["@mui/icons-material/EmailSharp" :default EmailSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-email-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EmailSharp)))