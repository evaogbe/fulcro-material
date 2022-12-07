(ns ogbe.fulcro.mui.data-display.avatar-group
  #?(:cljs (:require
            ["@mui/material/AvatarGroup" :default AvatarGroup]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-avatar-group #?(:clj  (fn [& _args])
                        :cljs (interop/react-factory AvatarGroup)))
