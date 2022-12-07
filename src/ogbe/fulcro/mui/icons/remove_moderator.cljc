(ns ogbe.fulcro.mui.icons.remove-moderator
  #?(:cljs (:require
            ["@mui/icons-material/RemoveModerator" :default RemoveModerator]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-remove-moderator
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RemoveModerator)))