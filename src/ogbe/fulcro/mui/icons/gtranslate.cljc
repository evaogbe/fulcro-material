(ns ogbe.fulcro.mui.icons.gtranslate
  #?(:cljs (:require
            ["@mui/icons-material/GTranslate" :default GTranslate]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-gtranslate
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GTranslate)))