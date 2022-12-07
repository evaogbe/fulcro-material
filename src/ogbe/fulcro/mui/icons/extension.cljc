(ns ogbe.fulcro.mui.icons.extension
  #?(:cljs (:require
            ["@mui/icons-material/Extension" :default Extension]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-extension
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Extension)))