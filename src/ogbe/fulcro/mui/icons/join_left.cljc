(ns ogbe.fulcro.mui.icons.join-left
  #?(:cljs (:require
            ["@mui/icons-material/JoinLeft" :default JoinLeft]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-join-left
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory JoinLeft)))