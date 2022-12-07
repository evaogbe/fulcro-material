(ns ogbe.fulcro.mui.icons.follow-the-signs
  #?(:cljs (:require
            ["@mui/icons-material/FollowTheSigns" :default FollowTheSigns]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-follow-the-signs
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FollowTheSigns)))