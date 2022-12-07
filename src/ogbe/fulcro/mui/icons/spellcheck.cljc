(ns ogbe.fulcro.mui.icons.spellcheck
  #?(:cljs (:require
            ["@mui/icons-material/Spellcheck" :default Spellcheck]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-spellcheck
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Spellcheck)))