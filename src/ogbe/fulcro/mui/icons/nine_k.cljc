(ns ogbe.fulcro.mui.icons.nine-k
  #?(:cljs (:require
            ["@mui/icons-material/NineK" :default NineK]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-nine-k
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NineK)))