(ns ogbe.fulcro.mui.icons.work
  #?(:cljs (:require
            ["@mui/icons-material/Work" :default Work]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-work
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Work)))