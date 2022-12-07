(ns ogbe.fulcro.mui.icons.not-accessible
  #?(:cljs (:require
            ["@mui/icons-material/NotAccessible" :default NotAccessible]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-not-accessible
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NotAccessible)))