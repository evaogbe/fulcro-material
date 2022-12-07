(ns ogbe.fulcro.mui.icons.translate
  #?(:cljs (:require
            ["@mui/icons-material/Translate" :default Translate]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-translate
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Translate)))