(ns ogbe.fulcro.mui.icons.sign-language
  #?(:cljs (:require
            ["@mui/icons-material/SignLanguage" :default SignLanguage]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sign-language
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SignLanguage)))