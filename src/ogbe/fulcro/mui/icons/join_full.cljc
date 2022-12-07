(ns ogbe.fulcro.mui.icons.join-full
  #?(:cljs (:require
            ["@mui/icons-material/JoinFull" :default JoinFull]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-join-full
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory JoinFull)))