(ns ogbe.fulcro.mui.icons.language-rounded
  #?(:cljs (:require
            ["@mui/icons-material/LanguageRounded" :default LanguageRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-language-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LanguageRounded)))