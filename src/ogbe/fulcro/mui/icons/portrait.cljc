(ns ogbe.fulcro.mui.icons.portrait
  #?(:cljs (:require
            ["@mui/icons-material/Portrait" :default Portrait]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-portrait
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Portrait)))