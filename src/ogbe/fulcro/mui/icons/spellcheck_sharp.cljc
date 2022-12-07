(ns ogbe.fulcro.mui.icons.spellcheck-sharp
  #?(:cljs (:require
            ["@mui/icons-material/SpellcheckSharp" :default SpellcheckSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-spellcheck-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SpellcheckSharp)))