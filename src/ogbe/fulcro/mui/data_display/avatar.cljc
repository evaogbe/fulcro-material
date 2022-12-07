(ns ogbe.fulcro.mui.data-display.avatar
  #?(:cljs (:require
            ["@mui/material/Avatar" :default Avatar]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-avatar #?(:clj  (fn [& _args])
                  :cljs (interop/react-factory Avatar)))
