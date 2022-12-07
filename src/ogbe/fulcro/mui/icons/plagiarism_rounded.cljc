(ns ogbe.fulcro.mui.icons.plagiarism-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PlagiarismRounded" :default PlagiarismRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-plagiarism-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PlagiarismRounded)))