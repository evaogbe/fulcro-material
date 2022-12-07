(ns ogbe.fulcro.mui.icons.code
  #?(:cljs (:require
            ["@mui/icons-material/Code" :default Code]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-code
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Code)))