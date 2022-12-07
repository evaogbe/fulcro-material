(ns ogbe.fulcro.mui.icons.train
  #?(:cljs (:require
            ["@mui/icons-material/Train" :default Train]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-train
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Train)))