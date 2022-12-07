(ns ogbe.fulcro.mui.icons.next-week
  #?(:cljs (:require
            ["@mui/icons-material/NextWeek" :default NextWeek]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-next-week
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NextWeek)))