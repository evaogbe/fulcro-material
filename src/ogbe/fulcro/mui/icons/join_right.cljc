(ns ogbe.fulcro.mui.icons.join-right
  #?(:cljs (:require
            ["@mui/icons-material/JoinRight" :default JoinRight]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-join-right
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory JoinRight)))