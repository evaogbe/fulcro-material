(ns ogbe.fulcro.mui.icons.spellcheck-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SpellcheckRounded" :default SpellcheckRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-spellcheck-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SpellcheckRounded)))