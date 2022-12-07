(ns ogbe.fulcro.mui.icons.sports
  #?(:cljs (:require
            ["@mui/icons-material/Sports" :default Sports]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sports
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Sports)))