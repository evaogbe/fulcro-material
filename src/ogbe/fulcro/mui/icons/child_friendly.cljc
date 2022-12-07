(ns ogbe.fulcro.mui.icons.child-friendly
  #?(:cljs (:require
            ["@mui/icons-material/ChildFriendly" :default ChildFriendly]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-child-friendly
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ChildFriendly)))