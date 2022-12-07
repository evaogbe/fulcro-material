(ns ogbe.fulcro.mui.icons.plagiarism
  #?(:cljs (:require
            ["@mui/icons-material/Plagiarism" :default Plagiarism]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-plagiarism
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Plagiarism)))