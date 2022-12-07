(ns ogbe.fulcro.mui.icons.remove
  #?(:cljs (:require
            ["@mui/icons-material/Remove" :default Remove]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-remove
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Remove)))