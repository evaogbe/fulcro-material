(ns ogbe.fulcro.mui.icons.language-outlined
  #?(:cljs (:require
            ["@mui/icons-material/LanguageOutlined" :default LanguageOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-language-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LanguageOutlined)))