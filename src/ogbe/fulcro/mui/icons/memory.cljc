(ns ogbe.fulcro.mui.icons.memory
  #?(:cljs (:require
            ["@mui/icons-material/Memory" :default Memory]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-memory
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Memory)))