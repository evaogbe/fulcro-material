(ns ogbe.fulcro.mui.icons.language
  #?(:cljs (:require
            ["@mui/icons-material/Language" :default Language]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-language
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Language)))