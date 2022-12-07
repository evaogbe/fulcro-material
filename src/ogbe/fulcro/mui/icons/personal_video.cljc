(ns ogbe.fulcro.mui.icons.personal-video
  #?(:cljs (:require
            ["@mui/icons-material/PersonalVideo" :default PersonalVideo]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-personal-video
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PersonalVideo)))