(ns ogbe.fulcro.mui.icons.language-sharp
  #?(:cljs (:require
            ["@mui/icons-material/LanguageSharp" :default LanguageSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-language-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LanguageSharp)))