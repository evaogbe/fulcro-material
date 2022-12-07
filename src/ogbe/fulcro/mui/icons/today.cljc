(ns ogbe.fulcro.mui.icons.today
  #?(:cljs (:require
            ["@mui/icons-material/Today" :default Today]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-today
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Today)))