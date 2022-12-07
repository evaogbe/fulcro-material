(ns ogbe.fulcro.mui.icons.translate-sharp
  #?(:cljs (:require
            ["@mui/icons-material/TranslateSharp" :default TranslateSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-translate-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TranslateSharp)))