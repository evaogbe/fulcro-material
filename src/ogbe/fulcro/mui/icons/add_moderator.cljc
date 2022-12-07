(ns ogbe.fulcro.mui.icons.add-moderator
  #?(:cljs (:require
            ["@mui/icons-material/AddModerator" :default AddModerator]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-add-moderator
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AddModerator)))