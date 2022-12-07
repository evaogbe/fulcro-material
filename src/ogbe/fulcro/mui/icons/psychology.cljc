(ns ogbe.fulcro.mui.icons.psychology
  #?(:cljs (:require
            ["@mui/icons-material/Psychology" :default Psychology]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-psychology
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Psychology)))